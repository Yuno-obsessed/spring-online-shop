import React from "react";
import styles from "./index.module.scss";

const buttonVariations = {
  black: {
    background: "none",
    color: "black",
    border: "1px solid black",
  },
  original: {
    backgroundColor: "#0AB843",
  },
};

export const Button = ({ img, text, variation, style }) => {
  const buttonStyle = buttonVariations[variation] || null;

  return (
    <button style={{ ...buttonStyle, ...style }} className={styles.root}>
      {img && <img src={img} alt="Button" />} {}
      {text}
    </button>
  );
};
