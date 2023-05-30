package com.example.homework2.entity;

import com.example.homework2.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ahmet
 */
@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Comment", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "PRODUCT_ID", length = 100, nullable = false)
    private Long productId;

    @Column(name = "USER_ID", length = 100, nullable = false)
    private Long userId;

    @Column(name = "COMMENT", length = 500, nullable = false)
    private String comment;
}
