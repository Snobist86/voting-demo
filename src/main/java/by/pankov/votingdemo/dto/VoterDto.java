package by.pankov.votingdemo.dto;

import by.pankov.votingdemo.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VoterDto {

    private Long id;
    private String e_mail;
    private Role role;
}
