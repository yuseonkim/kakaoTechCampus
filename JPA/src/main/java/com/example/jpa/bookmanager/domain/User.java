package com.example.jpa.bookmanager.domain;

import lombok.*;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@Entity
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="user_table")
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        this.updatedAt = LocalDateTime.now();

    }
//
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;
}
