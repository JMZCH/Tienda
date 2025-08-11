/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author arman
 */
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-programacionwebiic25.firebasestorage.app";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-programacionwebiic25-firebase-adminsdk-fbsvc-24a12ddc89"+".json";
}
