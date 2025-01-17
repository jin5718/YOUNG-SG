package com.d208.AIclerk.chatting.util;

import com.d208.AIclerk.chatting.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class InviteCodeGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @Autowired
    private RoomRepository meetingRoomRepository;

    public String generateInviteCode() {
        Random random = new Random();
        String inviteCode;

        do {
            StringBuilder builder = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                builder.append(CHARACTERS.charAt(randomIndex));
            }
            inviteCode = builder.toString();
        } while (meetingRoomRepository.existsByInviteCode(inviteCode));  // 중복 검사

        return inviteCode;
    }
}
