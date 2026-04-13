package in.heetvakharia.productservice.exception;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorResponse {
    public int errorCode;
    public String message;
    public boolean isSucess = false;

}
