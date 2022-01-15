// para eliminar ../../ -> adiciona no tsconfig.json   "baseUrl": "./src",
import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./styles.css";

function Navbar() {
  return (
    <header>
      {/*delimita a largura do conteudo*/}
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/pinalli">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/pinalli</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}
export default Navbar;
