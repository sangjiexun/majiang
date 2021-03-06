﻿using UnityEngine;
using System.Collections;
using DG.Tweening;
using AssemblyCSharp;

public class MessageBoxScript : MonoBehaviour {
	MyMahjongScript myMaj;
	// Use this for initialization
	void Start () {
		SocketEventHandle.getInstance ().messageBoxNotice += messageBoxNotice;
	}

	// Update is called once per frame
	void Update () {
	
	}

	public void btnClick(int index){
        SoundCtrl.getInstance ().playMessageBoxSound (index, GlobalDataScript.loginResponseData.account.sex);
        CustomSocket.getInstance ().sendMsg (new MessageBoxRequest(0, index,GlobalDataScript.loginResponseData.account.uuid, GlobalDataScript.loginResponseData.account.sex));
		if (myMaj == null) {
			myMaj = GameObject.Find ("Panel_GamePlay(Clone)").GetComponent<MyMahjongScript>();
		}
		if (myMaj != null) {
			myMaj.playerItems [0].showChatMessage (index);
		}
		hidePanel ();
	}

    public void gifClick(int index)
    {
        CustomSocket.getInstance().sendMsg(new MessageBoxRequest(1, index, GlobalDataScript.loginResponseData.account.uuid, GlobalDataScript.loginResponseData.account.sex));
        if (myMaj == null)
        {
            myMaj = GameObject.Find("Panel_GamePlay(Clone)").GetComponent<MyMahjongScript>();
        }
        if (myMaj != null)
        {
            myMaj.playerItems[0].showGifMessage(index);
        }
        hidePanel();
    }

	public void showPanel(){
		gameObject.transform.DOLocalMove (new Vector3(472,120), 0.4f);
	}

	public void hidePanel(){
		gameObject.transform.DOLocalMove (new Vector3(472,617), 0.4f);
	}

	public void messageBoxNotice(ClientResponse response){
		string[] arr = response.message.Split (new char[1]{ '|' });
        int type = int.Parse(arr[0]);
		int code = int.Parse(arr[1]);
        int sex = int.Parse(arr[3]);
        if(type == 0)
        {
            SoundCtrl.getInstance().playMessageBoxSound(code, sex);
        }
		
	}

	public void Destroy(){
		SocketEventHandle.getInstance ().messageBoxNotice -= messageBoxNotice;
	}
}
