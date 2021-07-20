package com.hanium.chungyakpassback.domain.entity.input;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table
public class 세대 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "세대id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "주소id")
    private 주소 주소;

    @Builder
    public 세대(주소 주소){
        this.주소 = 주소;
    }
}
