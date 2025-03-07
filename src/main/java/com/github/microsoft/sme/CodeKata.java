package com.github.microsoft.sme;

import java.util.function.IntSupplier;

public class CodeKata {

  private final IntSupplier randomNumberSupplier;

  public CodeKata(IntSupplier randomNumberSupplier) {
    this.randomNumberSupplier = randomNumberSupplier;
  }

  public int generateRandomNumber() {
    return randomNumberSupplier.getAsInt();
  }

}
