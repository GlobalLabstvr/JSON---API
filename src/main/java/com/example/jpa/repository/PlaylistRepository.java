package com.example.jpa.repository;


import com.example.jpa.model.Playlist;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;


/**
 * Created by rajeevkumarsingh on 21/11/17.
 */
@Repository


public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
@Query 
 Playlist findByTopicId(Long topicId);
 
   Optional<Playlist> findByIdAndTopicId(Long id, Long topicId);
}
