
package com.portfolio.apdani.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
  @Autowired IPersonaService ipersonaService; 
}
