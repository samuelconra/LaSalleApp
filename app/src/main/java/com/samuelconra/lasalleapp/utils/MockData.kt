package com.samuelconra.lasalleapp.utils

import com.samuelconra.lasalleapp.models.*

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg")
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg"),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg")
)

val subjects = listOf(
    Subject(name = "Metodología de la Investigación", teacher = "Elder De La Rosa Cruz"),
    Subject(name = "Conmutación de Redes", teacher = "Luis Felipe Vázquez Rodríguez"),
    Subject(name = "Administración de Proyectos", teacher = "Iván Ayala Manrique"),
    Subject(name = "Procesamiento de Imágenes", teacher = "Emmanuel Ovalle Magallanes"),
    Subject(name = "Taller de Desarrollo Móvil", teacher = "Teach"),
    Subject(name = "Modelos Abstractos", teacher = "Pedro León Cruz Parada"),
    Subject(name = "Administración de Base de Datos", teacher = "Luis Enrique Cuellar Vivia"),
    Subject(name = "Mundo desde Perspectiva Cristiana", teacher = "Daniel García Chavarín")
)
val student = Student(
    name = "Samuel",
    firstSurname = "Conde",
    secondSurname = "Rangel",
    birth = "14-10-2004",
    email = "scr77164@lasallebajio.edu.mx",
    career = "Ingeniería en Software y Sistemas Computacionales",
    semester = 5,
    enrollment = 77164,
    subjects = listOf(
        StudentSubject(subjects[0], 7.3, 6.8, 9.2),
        StudentSubject(subjects[1], 8.9, 9.7, 10.0),
        StudentSubject(subjects[2], 9.0, 10.0, 7.3),
        StudentSubject(subjects[3], 8.9, 9.3, 9.0),
        StudentSubject(subjects[4], 6.3, 8.8, 9.9),
        StudentSubject(subjects[5], 9.7, 8.3, 7.0),
        StudentSubject(subjects[6], 9.6, 9.6, 9.5),
        StudentSubject(subjects[7], 7.7, 9.8, 9.8),
    )
)