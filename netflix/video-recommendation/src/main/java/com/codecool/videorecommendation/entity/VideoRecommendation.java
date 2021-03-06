package com.codecool.videorecommendation.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class VideoRecommendation {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String recommendation;
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)
    private int videoId;


}
