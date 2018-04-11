package com.simpleproject.client;

import com.google.gwt.i18n.client.LocalizableResource.Generate;

@Generate(format = "com.google.gwt.i18n.server.PropertyCatalogFactory")
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  @DefaultMessage("Who are u?")
  String nameField();

  @DefaultMessage("Send")
  String sendButton();
}
