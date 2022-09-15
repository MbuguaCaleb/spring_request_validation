**Spring Request Validation**

```yaml

I need the Spring Validation Package first and foremost,

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-validation</artifactId>
</dependency>


It gives me the annotations for error handling.


Second


Concept of RestController Advice,

@RestControllerAdvice

Works hand in hand with

@RestController


Rest controller advice can receive the exceptions theown by the REST Controller,
and return a response to the user,


For Input Validations, i add @Valid annotation after my Reqeust Body.


@ExceptionHandler(MethodArgumentNotValidException.class)


The exception handler inside your advice can catch the exception and throw it as you handle
it.


N/B


There is no need of multiple try catch statements if you can handle related exceptions
in one place,


Just throw them then have a handler inside your advice,


```



**Notes By**

```yaml


Caleb Mbugua 

```