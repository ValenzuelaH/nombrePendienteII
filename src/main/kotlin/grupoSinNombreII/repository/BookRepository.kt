package grupoSinNombreII.repository

import grupoSinNombreII.model.Book
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestParam

@Repository
interface BookRepository: CrudRepository<Book, Long> {

    @Query("SELECT * FROM book WHERE name = :aName", nativeQuery = true )
    fun findByName(@RequestParam("aName") aName : String): Book?
}