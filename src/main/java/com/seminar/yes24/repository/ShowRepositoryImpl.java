package com.seminar.yes24.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import com.seminar.yes24.domain.Show;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;


import java.util.List;

import static com.seminar.yes24.domain.QRunShow.runShow;
import static com.seminar.yes24.domain.QShow.show;

@Repository
public class ShowRepositoryImpl implements ShowRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public ShowRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }


    public List<Show> getShowByGenre(String genre) {


        return queryFactory
                .selectFrom(show)
                .orderBy(show.ticketSales.asc())
                .limit(3)
                .fetch();
    }
}
