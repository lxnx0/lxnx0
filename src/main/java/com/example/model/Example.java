package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "EXAMPLE")
public class Example {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "EXAMPLE_TEXT")
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
