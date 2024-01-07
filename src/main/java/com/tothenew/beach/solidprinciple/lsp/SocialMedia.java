package com.tothenew.beach.solidprinciple.lsp;

public interface SocialMedia {
    //@support WhatsApp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract void groupVideoCall(String... users);
}
