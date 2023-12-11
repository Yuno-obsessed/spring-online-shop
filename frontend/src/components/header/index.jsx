import styles from "./index.module.scss";
import { Input } from "../input";
import { IconHeader } from "../icon/header";
import { useNavigate } from "react-router-dom";

export const Header = () => {
  const navigation = useNavigate();
  return (
    <div className={styles.root}>
      <div className={styles.container}>
        <h1
          onClick={() => {
            navigation("/");
          }}
          className={styles.title}
        >
          Rozetkded
        </h1>
        <Input
            onClick={() => {

            }}
            placeholder={"Я шукаю..."}
        />
        <div className={styles.icons}>
          <div className={styles.icon}>
            <IconHeader ico="/assets/header/header_cart.svg" />
            <p>Кошик</p>
          </div>
          <div className={styles.icon}>
            <IconHeader ico="/assets/header/header_user.svg" />
            <p>Профіль</p>
          </div>
          <div className={styles.icon}>
            <IconHeader ico="/assets/header/header_heart.svg" />
            <p>Бажане</p>
          </div>
          <div className={styles.mobile}>
            <div className={styles.icon}>
              <IconHeader ico="/assets/header/header_house.svg" />
              <p>Головна</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
