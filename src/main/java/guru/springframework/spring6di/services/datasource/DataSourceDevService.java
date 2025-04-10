package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class DataSourceDevService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Development";
    }
}
