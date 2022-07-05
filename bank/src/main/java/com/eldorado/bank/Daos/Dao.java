package com.eldorado.bank.Daos;

import java.util.List;
import java.util.Optional;

public interface Dao<Model> {
    Optional<Model> get(int id);

    List <Model> getAll();

    void save(Model model);
    void update(Model model, String[] params);
    void delete(Model model);
}
