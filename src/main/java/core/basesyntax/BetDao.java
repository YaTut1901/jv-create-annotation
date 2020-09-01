package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BetDao implements GenericDao<Bet> {
    @Override
    public Optional<Bet> get(int id) {
        return Optional.ofNullable(Storage.getBetStorage().get(id));
    }

    @Override
    public List<Bet> getAll() {
        return new ArrayList<>(Storage.getBetStorage().values());
    }

    @Override
    public boolean save(Bet bet) {
        Storage.getBetStorage().put(bet.getId(), bet);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        Storage.getBetStorage().remove(id);
        return true;
    }
}
