package com.playstore;

import java.util.ArrayList;

class Comment {
    private User user;
    private String content;
    private ArrayList<Comment> replies;
    
    Comment(User user, String content) {
        this.user = user;
        this.content = content;
        replies = new ArrayList<>();
    }

    User getUser() {
        return user;
    }

    String getContent() {
        return content;
    }

    ArrayList<Comment> getReplies() { return replies; }

    void addReply(Comment reply) {
        // Jane Doe replied "I never liked this game!"
        System.out.println(reply.getUser().getName() + " replied \"" + reply.getContent() + "\"");
        replies.add(reply);
    }
}
