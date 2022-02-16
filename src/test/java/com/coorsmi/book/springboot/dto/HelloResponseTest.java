package com.coorsmi.book.springboot.dto;


import com.coorsmi.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseTest {

    @Test
    public void 룸북_기능_테스트() {

        String name = "test";
        int amount =1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
