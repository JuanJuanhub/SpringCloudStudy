package com.test.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Book {
    int bid;
    String title;
    String desc;
}
