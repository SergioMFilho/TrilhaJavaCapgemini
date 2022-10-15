import './App.css';
import styled from 'styled-components';


const Titulo = styled.h1`
color: #31e636;
text-decoration: underline;
`;

const Subtitulo = styled.h2`
color: green;
font-size: 30px;
`;

const Artigo = styled.section`
color: #9393e2;
`;

const Titulo2 = styled.h1`
color: blue;
font-size: 25px;
`;

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Titulo>Meu site</Titulo>
        <Subtitulo>Subtitulo</Subtitulo>
        <Artigo> lorems é simplesmente uma simples forma de enrolar uma pessoa como você que está lendo mas tudo bem que você está lendo até o final então quer dizer que estou consguindo </Artigo>
        <Titulo2>Segunda Parte</Titulo2>
        <Artigo> lorems é simplesmente uma simples forma de enrolar uma pessoa como você que está lendo mas tudo bem que você está lendo até o final então quer dizer que estou consguindo </Artigo>
      </header>
    </div>
  );
}

export default App;
