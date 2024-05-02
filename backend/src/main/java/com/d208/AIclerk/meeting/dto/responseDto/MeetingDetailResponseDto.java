package com.d208.AIclerk.meeting.dto.responseDto;

import com.d208.AIclerk.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor @AllArgsConstructor
public class MeetingDetailResponseDto {

    private String summary;

    private List<String> participants;

    private String fileUrl;

    private String nextMeeting;

}
