package com.eliasfs06.tinktime.model;

public class ConcreteCreatorTatuador implements FuncionarioCreator {
    @Override
    public Funcionario createFuncionario() {
        return new Tatuador();
    }
}
