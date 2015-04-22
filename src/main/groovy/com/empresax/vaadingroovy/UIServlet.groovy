package com.empresax.vaadingroovy

import javax.servlet.annotation.WebServlet

import com.vaadin.annotations.VaadinServletConfiguration
import com.vaadin.server.VaadinServlet

@WebServlet(value = "/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = HomeUI.class)
class UIServlet extends VaadinServlet {
}

