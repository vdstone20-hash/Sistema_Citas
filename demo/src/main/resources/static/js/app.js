// Lista de perfiles de ejemplo (simulando la base de datos)
const perfiles = [
    { nombre: "Lucía, 22", bio: "Amante del café y los viajes 🌍", img: "https://images.unsplash.com/photo-1494790108377-be9c29b29330?auto=format&fit=crop&w=400&q=80" },
    { nombre: "Mateo, 24", bio: "Programador y gamer en mis tiempos libres 💻", img: "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?auto=format&fit=crop&w=400&q=80" },
    { nombre: "Sofía, 21", bio: "Diseñadora UX y música indie 🎧", img: "https://images.unsplash.com/photo-1534528741775-53994a69daeb?auto=format&fit=crop&w=400&q=80" }
];

let indiceActual = 0;

function mostrarPerfil() {
    if (indiceActual < perfiles.length) {
        document.getElementById("profile-img").src = perfiles[indiceActual].img;
        document.getElementById("profile-name").innerText = perfiles[indiceActual].nombre;
        document.getElementById("profile-bio").innerText = perfiles[indiceActual].bio;
    } else {
        document.getElementById("card").innerHTML = "<h2>¡No hay más perfiles cerca!</h2><p>Vuelve más tarde para descubrir nueva gente.</p>";
    }
}

function registrarSwipe(accion) {
    const card = document.getElementById("card");
    
    // Animación de salida según el botón presionado
    card.style.transform = accion === 'like' ? 'translateX(150px) rotate(20deg)' : 'translateX(-150px) rotate(-20deg)';
    card.style.opacity = '0';

    setTimeout(() => {
        if (accion === 'like' && Math.random() > 0.5) { // Simula probabilidad de Match mutuo
            mostrarMatchPopup();
        }

        indiceActual++;
        mostrarPerfil();

        // Restaurar posición de la tarjeta
        card.style.transform = 'translateX(0) rotate(0deg)';
        card.style.opacity = '1';
    }, 300);
}

function mostrarMatchPopup() {
    const popup = document.getElementById("matchPopup");
    popup.style.display = "block";
    setTimeout(() => {
        popup.style.display = "none";
    }, 2000);
}

// Cargar el primer perfil al iniciar
window.onload = mostrarPerfil;