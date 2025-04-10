package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class DataSourceProdService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Production";
    }
}
