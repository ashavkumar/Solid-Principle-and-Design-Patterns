package com.tothenew.beach.solidprinciple.lsp;

public class WhatsApp implements SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        //Does not support by WhatsApp
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
