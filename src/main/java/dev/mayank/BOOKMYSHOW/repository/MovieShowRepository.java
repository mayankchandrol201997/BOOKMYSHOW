package dev.mayank.BOOKMYSHOW.repository;

import dev.mayank.BOOKMYSHOW.models.MovieShow;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow,Integer> {
}
