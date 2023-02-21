package com.ivandjoh.service;

import com.ivandjoh.dto.TransferDto;
import com.ivandjoh.entity.Transfer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
@ApplicationScoped
public class TransferService {

    @Inject
    EntityManager em;

    public List<Transfer> findAll() {
        return em.createQuery("select t from Transfer t", Transfer.class).getResultList();
    }

    public Long create(TransferDto transferDto) {
        Transfer transfer = new Transfer();
        transfer.setAccountFrom(transferDto.getAccountFrom());
        transfer.setAccountTo(transferDto.getAccountTo());
        transfer.setAmount(transferDto.getAmount());
        transfer.setTransferDate(new Date());
        em.persist(transfer);

        return transfer.getId();
    }
}
