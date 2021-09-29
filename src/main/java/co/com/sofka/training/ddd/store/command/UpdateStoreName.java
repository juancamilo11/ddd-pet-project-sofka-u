package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.store.values.StoreName;

public class UpdateStoreName implements Command {

    StoreName storeName;

    public UpdateStoreName(StoreName storeName) {
        this.storeName = storeName;
    }

    public StoreName getStoreName() {
        return storeName;
    }

    public void setStoreName(StoreName storeName) {
        this.storeName = storeName;
    }
}
