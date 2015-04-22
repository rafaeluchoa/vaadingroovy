package com.empresax.vaadingroovy

import groovy.transform.CompileStatic;

import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.Notification
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

@CompileStatic
class HomeUI extends UI {

    @Override
    protected void init(VaadinRequest request) {

        def vl = new VerticalLayout()
		vl.setMargin(true)
		vl.setSpacing(true)

        vl.addComponent(new Label("Vaadin Groovy"))
		
		final def nome = new TextField("Nome")
		vl.addComponent(nome)

        def bt = new Button("Click")
        bt.addClickListener(new Button.ClickListener() {

            @Override
            void buttonClick(Button.ClickEvent event) {
                Notification.show("Hello " + nome.getValue())
            }
        })
        vl.addComponent(bt)

        setContent(vl)
    }
}

