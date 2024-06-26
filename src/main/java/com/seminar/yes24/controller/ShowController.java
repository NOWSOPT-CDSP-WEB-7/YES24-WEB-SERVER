package com.seminar.yes24.controller;

import com.seminar.yes24.domain.QShow;
import com.seminar.yes24.domain.Show;
import com.seminar.yes24.dto.common.ResponseDto;
import com.seminar.yes24.dto.response.ShowDataDto;
import com.seminar.yes24.dto.response.ShowRankingDto;
import com.seminar.yes24.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShowController {
    private final ShowService showService;

    @GetMapping("/show/main")
    public ResponseDto<List<ShowDataDto>> getMainCarasel(){
        return ResponseDto.ok( showService.getMainCarasel());
    }
    @GetMapping("/show/rank")
    public ResponseDto <List<ShowRankingDto>> getShowRanking(

    ){
        return ResponseDto.ok(showService.getShowRanking());
    }


}
