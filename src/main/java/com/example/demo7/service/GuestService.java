package com.example.demo7.service;

import com.example.demo7.entity.Guest;
import com.example.demo7.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestService {

  private final GuestRepository guestRepository;

  public Page<Guest> getGuestList(int pag, int pageSize) {
    PageRequest pageable = PageRequest.of(pag, pageSize, Sort.by(Sort.Order.desc("id")));
    //Pageable pageable = PageRequest.of(pag, pageSize, Sort.Direction.DESC, "id");
    return guestRepository.findAll(pageable);
  }

  public void setGuestInput(Guest guest) {
    guestRepository.save(guest);
  }
}
