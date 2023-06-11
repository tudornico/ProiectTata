package com.example.usermanagement.Controller;

import com.example.usermanagement.Model.LogIn.JwtResponse;
import com.example.usermanagement.Model.LogIn.JwtTokenUnit;
import com.example.usermanagement.Service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.usermanagement.Model.LogIn.JwtRequest;
@RestController
@CrossOrigin
public class JwtAuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUnit jwtTokenUnit;

    @Autowired
    private JwtService userService;


    @RequestMapping(value = "/authentiticate" , method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception{
        authenticate(authenticationRequest.getUsername() , authenticationRequest.getPassword());


        final UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUnit.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    public void authenticate(String username , String password) throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username , password));
        }
        catch (DisabledException e){
            throw  new Exception("USER_DISABLED" , e);
        }
        catch (BadCredentialsException e ){
            throw new Exception("BAD_CREDENTIALS" , e);
        }
    }
}
