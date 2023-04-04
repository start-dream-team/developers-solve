package com.developers.solve.problem.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProblemUpdateRequestDto {
    private Long problemId;
    private String type;
    private String writer;
    private String title;
    private String content;
    private String answer;
    private String hashTag;
    private String level;
}
