package com.kumar.interview.solid.lsp;

public abstract class SocialMedia {

	//Supports WhatsApp, facebook, Instagram
	public abstract void chatWithFriend();
	
	//Supports facebook, Instagram
	public abstract void publishPost(Object post);
	
	//Supports WhatsApp, facebook, Instagram
	public abstract void sendPhotosAndVideos();
	
	//Supports WhatsApp, facebook
	public abstract void groupVideoCall(String ...users);
}
