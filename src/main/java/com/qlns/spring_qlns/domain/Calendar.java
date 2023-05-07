package com.qlns.spring_qlns.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "calendar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calendar {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location")
    private String name;
    @Column(name = "content")
    private String content;
    @Column(name = "status")
    private int status;
    @ManyToOne
    @JoinColumn(name = "day_id",referencedColumnName = "id")
    private Day day;
    @ManyToOne
    @JoinColumn(name = "shift_id",referencedColumnName = "id")
    private Shift shift;
    @ManyToOne
    @JoinColumn(name = "form_id",referencedColumnName = "id")
    private Form form;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

}