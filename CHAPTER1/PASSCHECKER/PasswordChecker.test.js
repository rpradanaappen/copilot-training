import { checkPassword } from "./PasswordChecker.js";
import { describe, test } from "node:test";
import * as assert from "node:assert";

describe("PasswordChecker", () => {
    const sut = checkPassword;
    test("should throw an error if the password is not a string", () => {
        assert.throws(() => sut(123), {
            message: "Password should be a string",
        });
    });

    test("should throw an error if the password is less than 8 characters long", () => {
        assert.throws(() => sut("abc123"), {
            message: "Password should be at least 8 characters long",
        });
    });

});
