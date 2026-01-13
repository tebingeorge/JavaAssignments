package com.test.unit_testing;

class ValidationService {
void validate(String input) throws Exception {
if (input == null || input.isEmpty())
throw new EmptyInputException("Input is empty");
if (input.length() < 5)
throw new InvalidLengthException("Input too short");
}
}
