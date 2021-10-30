package se.adesso.wjaxmulesoftdemo.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Employee {

    private UUID id = UUID.randomUUID();
    @NonNull
    private int databaseId;
    @NonNull
    private String name;
    @NonNull
    private EType type;
    @NonNull
    private EGender gender;
    @NonNull
    private LocalDate birthday;
}
