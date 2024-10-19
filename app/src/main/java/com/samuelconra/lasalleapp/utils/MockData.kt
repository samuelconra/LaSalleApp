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
    Subject(name = "Metodología de la Investigación", teacher = "Elder De La Rosa Cruz", icon = Lab_research),
    Subject(name = "Conmutación de Redes", teacher = "Luis Felipe Vázquez Rodríguez", icon = Ethernet),
    Subject(name = "Administración de Proyectos", teacher = "Iván Ayala Manrique", icon = Book_4),
    Subject(name = "Procesamiento de Imágenes", teacher = "Emmanuel Ovalle Magallanes", icon = Images),
    Subject(name = "Taller de Desarrollo Móvil", teacher = "Teach", icon = Android2),
    Subject(name = "Modelos Abstractos", teacher = "Pedro León Cruz Parada", icon = Code),
    Subject(name = "Administración de Base de Datos", teacher = "Luis Enrique Cuellar Vivia", icon = Database),
    Subject(name = "Mundo desde Perspectiva Cristiana", teacher = "Daniel García Chavarín", icon = Eye_tracking)
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
        StudentSubject(1, subjects[0], 7.3, 10.0, 9.2),
        StudentSubject(2, subjects[1], 6.1, 5.8, 5.4),
        StudentSubject(3, subjects[2], 9.0, 10.0, 7.3),
        StudentSubject(4, subjects[3], 8.9, 9.3, 9.0),
        StudentSubject(5, subjects[4], 10.0, 8.8, 9.9),
        StudentSubject(6, subjects[5], 9.7, 8.3, 7.0),
        StudentSubject(7, subjects[6], 4.3, 6.6, 5.5),
        StudentSubject(8, subjects[7], 7.7, 9.8, 9.8),
    ),
    payments = listOf(
        Payment(1, period = "Enero", dueDate = "15-01-2024", status = PaymentStatus.PAID),
        Payment(2, period = "Febrero", dueDate = "15-02-2024", status = PaymentStatus.PAID),
        Payment(3, period = "Marzo", dueDate = "15-03-2024", status = PaymentStatus.PAID),
        Payment(4, period = "Abril", dueDate = "15-04-2024", status = PaymentStatus.PAID),
        Payment(5, period = "Mayo", dueDate = "15-05-2024", status = PaymentStatus.PAID),
        Payment(6, period = "Junio", dueDate = "15-06-2024", status = PaymentStatus.PAID),
        Payment(7, period = "Julio", dueDate = "15-07-2024", status = PaymentStatus.PAID),
        Payment(8, period = "Agosto", dueDate = "15-08-2024", status = PaymentStatus.PAID),
        Payment(9, period = "Septiembre", dueDate = "15-09-2024", status = PaymentStatus.PAID),
        Payment(10, period = "Octubre", dueDate = "15-10-2024", status = PaymentStatus.OVERDUE),
        Payment(11, period = "Noviembre", dueDate = "15-11-2024", status = PaymentStatus.PENDING),
        Payment(12, period = "Diciembre", dueDate = "15-12-2024", status = PaymentStatus.PENDING),
    )
)