package br.com.alura.orgs.database.dao

import androidx.room.*
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {

    @Query("SELECT * FROM Produto")
    fun buscaTodos() : List<Produto>

    @Insert
    fun salva(vararg produto: Produto)

    @Update
    fun altera(vararg produto: Produto)

    @Delete
    fun remove(vararg produto: Produto)

    @Query("SELECT * FROM Produto WHERE id = :id")
    fun findById(id : Long) : Produto?


}