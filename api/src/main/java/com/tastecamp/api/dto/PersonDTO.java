package com.tastecamp.api.dto;

public record PersonDTO(String name, String lastname, String birthdate, String phone, String email) {
}

// {
// "name": "Anthony Joaquim",
// "lastname": "Tanan",
// "birthdate": "10/02/2006",
// "phone": "75988336644",
// "email": "joaquim@gmail.com",
// }