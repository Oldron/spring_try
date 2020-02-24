package com.example.spring_try.service;

import com.example.spring_try.entity.WorkTime;

import java.util.Date;
import java.util.List;

public interface WorkTimeService {
    List<WorkTime> getAll();
    List<WorkTime> getAll(String name, Date date);
}
