package test.domain;

import java.util.List;

import test.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="ranks", path="ranks")
public interface RankRepository extends PagingAndSortingRepository<Rank, Long>{
  List<Rank> (String findByName);
}
