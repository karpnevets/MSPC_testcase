import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
class Node implements Comparable<Node>{
    int next, weight;

    public Node(int next, int weight){
        this.next = next;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}
public class mspc_testcase_handler {
    static String[] name = {"aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax", "ay", "az", "ba", "bb", "bc", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bk", "bl", "bm", "bn", "bo", "bp", "bq", "br", "bs", "bt", "bu", "bv", "bw", "bx", "by", "bz", "ca", "cb", "cc", "cd", "ce", "cf", "cg", "ch", "ci", "cj", "ck", "cl", "cm", "cn", "co", "cp", "cq", "cr", "cs", "ct", "cu", "cv", "cw", "cx", "cy", "cz", "da", "db", "dc", "dd", "de", "df", "dg", "dh", "di", "dj", "dk", "dl", "dm", "dn", "do", "dp", "dq", "dr", "ds", "dt", "du", "dv", "dw", "dx", "dy", "dz", "ea", "eb", "ec", "ed", "ee", "ef", "eg", "eh", "ei", "ej", "ek", "el", "em", "en", "eo", "ep", "eq", "er", "es", "et", "eu", "ev", "ew", "ex", "ey", "ez", "fa", "fb", "fc", "fd", "fe", "ff", "fg", "fh", "fi", "fj", "fk", "fl", "fm", "fn", "fo", "fp", "fq", "fr", "fs", "ft", "fu", "fv", "fw", "fx", "fy", "fz", "ga", "gb", "gc", "gd", "ge", "gf", "gg", "gh", "gi", "gj", "gk", "gl", "gm", "gn", "go", "gp", "gq", "gr", "gs", "gt", "gu", "gv", "gw", "gx", "gy", "gz", "ha", "hb", "hc", "hd", "he", "hf", "hg", "hh", "hi", "hj", "hk", "hl", "hm", "hn", "ho", "hp", "hq", "hr", "hs", "ht", "hu", "hv", "hw", "hx", "hy", "hz", "ia", "ib", "ic", "id", "ie", "if", "ig", "ih", "ii", "ij", "ik", "il", "im", "in", "io", "ip", "iq", "ir", "is", "it", "iu", "iv", "iw", "ix", "iy", "iz", "ja", "jb", "jc", "jd", "je", "jf", "jg", "jh", "ji", "jj", "jk", "jl", "jm", "jn", "jo", "jp", "jq", "jr", "js", "jt", "ju", "jv", "jw", "jx", "jy", "jz", "ka", "kb", "kc", "kd", "ke", "kf", "kg", "kh", "ki", "kj", "kk", "kl", "km", "kn", "ko", "kp", "kq", "kr", "ks", "kt", "ku", "kv", "kw", "kx", "ky", "kz", "la", "lb", "lc", "ld", "le", "lf", "lg", "lh", "li", "lj", "lk", "ll", "lm", "ln", "lo", "lp", "lq", "lr", "ls", "lt", "lu", "lv", "lw", "lx", "ly", "lz", "ma", "mb", "mc", "md", "me", "mf", "mg", "mh", "mi", "mj", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nb", "nc", "nd", "ne", "nf", "ng", "nh", "ni", "nj", "nk", "nl", "nm", "nn", "no", "np", "nq", "nr", "ns", "nt", "nu", "nv", "nw", "nx", "ny", "nz", "oa", "ob", "oc", "od", "oe", "of", "og", "oh", "oi", "oj", "ok", "ol", "om", "on", "oo", "op", "oq", "or", "os", "ot", "ou", "ov", "ow", "ox", "oy", "oz", "pa", "pb", "pc", "pd", "pe", "pf", "pg", "ph", "pi", "pj", "pk", "pl", "pm", "pn", "po", "pp", "pq", "pr", "ps", "pt", "pu", "pv", "pw", "px", "py", "pz", "qa", "qb", "qc", "qd", "qe", "qf", "qg", "qh", "qi", "qj", "qk", "ql", "qm", "qn", "qo", "qp", "qq", "qr", "qs", "qt", "qu", "qv", "qw", "qx", "qy", "qz", "ra", "rb", "rc", "rd", "re", "rf", "rg", "rh", "ri", "rj", "rk", "rl", "rm", "rn", "ro", "rp", "rq", "rr", "rs", "rt", "ru", "rv", "rw", "rx", "ry", "rz", "sa", "sb", "sc", "sd", "se", "sf", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sp", "sq", "sr", "ss", "st", "su", "sv", "sw", "sx", "sy", "sz", "ta", "tb", "tc", "td", "te", "tf", "tg", "th", "ti", "tj", "tk", "tl", "tm", "tn", "to", "tp", "tq", "tr", "ts", "tt", "tu", "tv", "tw", "tx", "ty", "tz", "ua", "ub", "uc", "ud", "ue", "uf", "ug", "uh", "ui", "uj", "uk", "ul", "um", "un", "uo", "up", "uq", "ur", "us", "ut", "uu", "uv", "uw", "ux", "uy", "uz", "va", "vb", "vc", "vd", "ve", "vf", "vg", "vh", "vi", "vj", "vk", "vl", "vm", "vn", "vo", "vp", "vq", "vr", "vs", "vt", "vu", "vv", "vw", "vx", "vy", "vz", "wa", "wb", "wc", "wd", "we", "wf", "wg", "wh", "wi", "wj", "wk", "wl", "wm", "wn", "wo", "wp", "wq", "wr", "ws", "wt", "wu", "wv", "ww", "wx", "wy", "wz", "xa", "xb", "xc", "xd", "xe", "xf", "xg", "xh", "xi", "xj", "xk", "xl", "xm", "xn", "xo", "xp", "xq", "xr", "xs", "xt", "xu", "xv", "xw", "xx", "xy", "xz", "ya", "yb", "yc", "yd", "ye", "yf", "yg", "yh", "yi", "yj", "yk", "yl", "ym", "yn", "yo", "yp", "yq", "yr", "ys", "yt", "yu", "yv", "yw", "yx", "yy", "yz", "za", "zb", "zc", "zd", "ze", "zf", "zg", "zh", "zi", "zj", "zk", "zl", "zm", "zn", "zo", "zp", "zq", "zr", "zs", "zt", "zu", "zv", "zw", "zx", "zy", "zz", "aaa", "aba", "aca", "ada", "aea", "afa", "aga", "aha", "aia", "aja", "aka", "ala", "ama", "ana", "aoa", "apa", "aqa", "ara", "asa", "ata", "aua", "ava", "awa", "axa", "aya", "aza", "bab", "bbb", "bcb", "bdb", "beb", "bfb", "bgb", "bhb", "bib", "bjb", "bkb", "blb", "bmb", "bnb", "bob", "bpb", "bqb", "brb", "bsb", "btb", "bub", "bvb", "bwb", "bxb", "byb", "bzb", "cac", "cbc", "ccc", "cdc", "cec", "cfc", "cgc", "chc", "cic", "cjc", "ckc", "clc", "cmc", "cnc", "coc", "cpc", "cqc", "crc", "csc", "ctc", "cuc", "cvc", "cwc", "cxc", "cyc", "czc", "dad", "dbd", "dcd", "ddd", "ded", "dfd", "dgd", "dhd", "did", "djd", "dkd", "dld", "dmd", "dnd", "dod", "dpd", "dqd", "drd", "dsd", "dtd", "dud", "dvd", "dwd", "dxd", "dyd", "dzd", "eae", "ebe", "ece", "ede", "eee", "efe", "ege", "ehe", "eie", "eje", "eke", "ele", "eme", "ene", "eoe", "epe", "eqe", "ere", "ese", "ete", "eue", "eve", "ewe", "exe", "eye", "eze", "faf", "fbf", "fcf", "fdf", "fef", "fff", "fgf", "fhf", "fif", "fjf", "fkf", "flf", "fmf", "fnf", "fof", "fpf", "fqf", "frf", "fsf", "ftf", "fuf", "fvf", "fwf", "fxf", "fyf", "fzf", "gag", "gbg", "gcg", "gdg", "geg", "gfg", "ggg", "ghg", "gig", "gjg", "gkg", "glg", "gmg", "gng", "gog", "gpg", "gqg", "grg", "gsg", "gtg", "gug", "gvg", "gwg", "gxg", "gyg", "gzg", "hah", "hbh", "hch", "hdh", "heh", "hfh", "hgh", "hhh", "hih", "hjh", "hkh", "hlh", "hmh", "hnh", "hoh", "hph", "hqh", "hrh", "hsh", "hth", "huh", "hvh", "hwh", "hxh", "hyh", "hzh", "iai", "ibi", "ici", "idi", "iei", "ifi", "igi", "ihi", "iii", "iji", "iki", "ili", "imi", "ini", "ioi", "ipi", "iqi", "iri", "isi", "iti", "iui", "ivi", "iwi", "ixi", "iyi", "izi", "jaj", "jbj", "jcj", "jdj", "jej", "jfj", "jgj", "jhj", "jij", "jjj", "jkj", "jlj", "jmj", "jnj", "joj", "jpj", "jqj", "jrj", "jsj", "jtj", "juj", "jvj", "jwj", "jxj", "jyj", "jzj", "kak", "kbk", "kck", "kdk", "kek", "kfk", "kgk", "khk", "kik", "kjk", "kkk", "klk", "kmk", "knk", "kok", "kpk", "kqk", "krk", "ksk", "ktk", "kuk", "kvk", "kwk", "kxk", "kyk", "kzk", "lal", "lbl", "lcl", "ldl", "lel", "lfl", "lgl", "lhl", "lil", "ljl", "lkl", "lll", "lml", "lnl", "lol", "lpl", "lql", "lrl", "lsl", "ltl", "lul", "lvl", "lwl", "lxl", "lyl", "lzl", "mam", "mbm", "mcm", "mdm", "mem", "mfm", "mgm", "mhm", "mim", "mjm", "mkm", "mlm", "mmm", "mnm", "mom", "mpm", "mqm", "mrm", "msm", "mtm", "mum", "mvm", "mwm", "mxm", "mym", "mzm", "nan", "nbn", "ncn", "ndn", "nen", "nfn", "ngn", "nhn", "nin", "njn", "nkn", "nln", "nmn", "nnn", "non", "npn", "nqn", "nrn", "nsn", "ntn", "nun", "nvn", "nwn", "nxn", "nyn", "nzn", "oao", "obo", "oco", "odo", "oeo", "ofo", "ogo", "oho", "oio", "ojo", "oko", "olo", "omo", "ono", "ooo", "opo", "oqo", "oro", "oso", "oto", "ouo", "ovo", "owo", "oxo", "oyo", "ozo", "pap", "pbp", "pcp", "pdp", "pep", "pfp", "pgp", "php", "pip", "pjp", "pkp", "plp", "pmp", "pnp", "pop", "ppp", "pqp", "prp", "psp", "ptp", "pup", "pvp", "pwp", "pxp", "pyp", "pzp", "qaq", "qbq", "qcq", "qdq", "qeq", "qfq", "qgq", "qhq", "qiq", "qjq", "qkq", "qlq", "qmq", "qnq", "qoq", "qpq", "qqq", "qrq", "qsq", "qtq", "quq", "qvq", "qwq", "qxq", "qyq", "qzq", "rar", "rbr", "rcr", "rdr", "rer", "rfr", "rgr", "rhr", "rir", "rjr", "rkr", "rlr", "rmr", "rnr", "ror", "rpr", "rqr", "rrr", "rsr", "rtr", "rur", "rvr", "rwr", "rxr", "ryr", "rzr", "sas", "sbs", "scs", "sds", "ses", "sfs", "sgs", "shs", "sis", "sjs", "sks", "sls", "sms", "sns", "sos", "sps", "sqs", "srs", "sss", "sts", "sus", "svs", "sws", "sxs", "sys", "szs", "tat", "tbt", "tct", "tdt", "tet", "tft", "tgt", "tht", "tit", "tjt", "tkt", "tlt", "tmt", "tnt", "tot", "tpt", "tqt", "trt", "tst", "ttt", "tut", "tvt", "twt", "txt", "tyt", "tzt", "uau", "ubu", "ucu", "udu", "ueu", "ufu", "ugu", "uhu", "uiu", "uju", "uku", "ulu", "umu", "unu", "uou", "upu", "uqu", "uru", "usu", "utu", "uuu", "uvu", "uwu", "uxu", "uyu", "uzu", "vav", "vbv", "vcv", "vdv", "vev", "vfv", "vgv", "vhv", "viv", "vjv", "vkv", "vlv", "vmv", "vnv", "vov", "vpv", "vqv", "vrv", "vsv", "vtv", "vuv", "vvv", "vwv", "vxv", "vyv", "vzv", "waw", "wbw", "wcw", "wdw", "wew", "wfw", "wgw", "whw", "wiw", "wjw", "wkw", "wlw", "wmw", "wnw", "wow", "wpw", "wqw", "wrw", "wsw", "wtw", "wuw", "wvw", "www", "wxw", "wyw", "wzw", "xax", "xbx", "xcx", "xdx", "xex", "xfx", "xgx", "xhx", "xix", "xjx", "xkx", "xlx", "xmx", "xnx", "xox", "xpx", "xqx", "xrx", "xsx", "xtx", "xux", "xvx", "xwx", "xxx", "xyx", "xzx", "yay", "yby", "ycy", "ydy", "yey", "yfy", "ygy", "yhy", "yiy", "yjy", "yky", "yly", "ymy", "yny", "yoy", "ypy", "yqy", "yry", "ysy", "yty", "yuy", "yvy", "ywy", "yxy", "yyy", "yzy", "zaz", "zbz", "zcz", "zdz", "zez", "zfz", "zgz", "zhz", "ziz", "zjz", "zkz", "zlz", "zmz", "znz", "zoz", "zpz", "zqz", "zrz", "zsz", "ztz", "zuz", "zvz", "zwz", "zxz", "zyz", "zzz", "aaaa", "abab", "acac", "adad", "aeae", "afaf", "agag", "ahah", "aiai", "ajaj", "akak", "alal", "amam", "anan", "aoao", "apap", "aqaq", "arar", "asas", "atat", "auau", "avav", "awaw", "axax", "ayay", "azaz", "baba", "bbbb", "bcbc", "bdbd", "bebe", "bfbf", "bgbg", "bhbh", "bibi", "bjbj", "bkbk", "blbl", "bmbm", "bnbn", "bobo", "bpbp", "bqbq", "brbr", "bsbs", "btbt", "bubu", "bvbv", "bwbw", "bxbx", "byby", "bzbz", "caca", "cbcb", "cccc", "cdcd", "cece", "cfcf", "cgcg", "chch", "cici", "cjcj", "ckck", "clcl", "cmcm", "cncn", "coco", "cpcp", "cqcq", "crcr", "cscs", "ctct", "cucu", "cvcv", "cwcw", "cxcx", "cycy", "czcz", "dada", "dbdb", "dcdc", "dddd", "dede", "dfdf", "dgdg", "dhdh", "didi", "djdj", "dkdk", "dldl", "dmdm", "dndn", "dodo", "dpdp", "dqdq", "drdr", "dsds", "dtdt", "dudu", "dvdv", "dwdw", "dxdx", "dydy", "dzdz", "eaea", "ebeb", "ecec", "eded", "eeee", "efef", "egeg", "eheh", "eiei", "ejej", "ekek", "elel", "emem", "enen", "eoeo", "epep", "eqeq", "erer", "eses", "etet", "eueu", "evev", "ewew", "exex", "eyey", "ezez", "fafa", "fbfb", "fcfc", "fdfd", "fefe", "ffff", "fgfg", "fhfh", "fifi", "fjfj", "fkfk", "flfl", "fmfm", "fnfn", "fofo", "fpfp", "fqfq", "frfr", "fsfs", "ftft", "fufu", "fvfv", "fwfw", "fxfx", "fyfy", "fzfz", "gaga", "gbgb", "gcgc", "gdgd", "gege", "gfgf", "gggg", "ghgh", "gigi", "gjgj", "gkgk", "glgl", "gmgm", "gngn", "gogo", "gpgp", "gqgq", "grgr", "gsgs", "gtgt", "gugu", "gvgv", "gwgw", "gxgx", "gygy", "gzgz", "haha", "hbhb", "hchc", "hdhd", "hehe", "hfhf", "hghg", "hhhh", "hihi", "hjhj", "hkhk", "hlhl", "hmhm", "hnhn", "hoho", "hphp", "hqhq", "hrhr", "hshs", "htht", "huhu", "hvhv", "hwhw", "hxhx", "hyhy", "hzhz", "iaia", "ibib", "icic", "idid", "ieie", "ifif", "igig", "ihih", "iiii", "ijij", "ikik", "ilil", "imim", "inin", "ioio", "ipip", "iqiq", "irir", "isis", "itit", "iuiu", "iviv", "iwiw", "ixix", "iyiy", "iziz", "jaja", "jbjb", "jcjc", "jdjd", "jeje", "jfjf", "jgjg", "jhjh", "jiji", "jjjj", "jkjk", "jljl", "jmjm", "jnjn", "jojo", "jpjp", "jqjq", "jrjr", "jsjs", "jtjt", "juju", "jvjv", "jwjw", "jxjx", "jyjy", "jzjz", "kaka", "kbkb", "kckc", "kdkd", "keke", "kfkf", "kgkg", "khkh", "kiki", "kjkj", "kkkk", "klkl", "kmkm", "knkn", "koko", "kpkp", "kqkq", "krkr", "ksks", "ktkt", "kuku", "kvkv", "kwkw", "kxkx", "kyky", "kzkz", "lala", "lblb", "lclc", "ldld", "lele", "lflf", "lglg", "lhlh", "lili", "ljlj", "lklk", "llll", "lmlm", "lnln", "lolo", "lplp", "lqlq", "lrlr", "lsls", "ltlt", "lulu", "lvlv", "lwlw", "lxlx", "lyly", "lzlz", "mama", "mbmb", "mcmc", "mdmd", "meme", "mfmf", "mgmg", "mhmh", "mimi", "mjmj", "mkmk", "mlml", "mmmm", "mnmn", "momo", "mpmp", "mqmq", "mrmr", "msms", "mtmt", "mumu", "mvmv", "mwmw", "mxmx", "mymy", "mzmz", "nana", "nbnb", "ncnc", "ndnd", "nene", "nfnf", "ngng", "nhnh", "nini", "njnj", "nknk", "nlnl", "nmnm", "nnnn", "nono", "npnp", "nqnq", "nrnr", "nsns", "ntnt", "nunu", "nvnv", "nwnw", "nxnx", "nyny", "nznz", "oaoa", "obob", "ococ", "odod", "oeoe", "ofof", "ogog", "ohoh", "oioi", "ojoj", "okok", "olol", "omom", "onon", "oooo", "opop", "oqoq", "oror", "osos", "otot", "ouou", "ovov", "owow", "oxox", "oyoy", "ozoz", "papa", "pbpb", "pcpc", "pdpd", "pepe", "pfpf", "pgpg", "phph", "pipi", "pjpj", "pkpk", "plpl", "pmpm", "pnpn", "popo", "pppp", "pqpq", "prpr", "psps", "ptpt", "pupu", "pvpv", "pwpw", "pxpx", "pypy", "pzpz", "qaqa", "qbqb", "qcqc", "qdqd", "qeqe", "qfqf", "qgqg", "qhqh", "qiqi", "qjqj", "qkqk", "qlql", "qmqm", "qnqn", "qoqo", "qpqp", "qqqq", "qrqr", "qsqs", "qtqt", "ququ", "qvqv", "qwqw", "qxqx", "qyqy", "qzqz", "rara", "rbrb", "rcrc", "rdrd", "rere", "rfrf", "rgrg", "rhrh", "riri", "rjrj", "rkrk", "rlrl", "rmrm", "rnrn", "roro", "rprp", "rqrq", "rrrr", "rsrs", "rtrt", "ruru", "rvrv", "rwrw", "rxrx", "ryry", "rzrz", "sasa", "sbsb", "scsc", "sdsd", "sese", "sfsf", "sgsg", "shsh", "sisi", "sjsj", "sksk", "slsl", "smsm", "snsn", "soso", "spsp", "sqsq", "srsr", "ssss", "stst", "susu", "svsv", "swsw", "sxsx", "sysy", "szsz", "tata", "tbtb", "tctc", "tdtd", "tete", "tftf", "tgtg", "thth", "titi", "tjtj", "tktk", "tltl", "tmtm", "tntn", "toto", "tptp", "tqtq", "trtr", "tsts", "tttt", "tutu", "tvtv", "twtw", "txtx", "tyty", "tztz", "uaua", "ubub", "ucuc", "udud", "ueue", "ufuf", "ugug", "uhuh", "uiui", "ujuj", "ukuk", "ulul", "umum", "unun", "uouo", "upup", "uquq", "urur", "usus", "utut", "uuuu", "uvuv", "uwuw", "uxux", "uyuy", "uzuz", "vava", "vbvb", "vcvc", "vdvd", "veve", "vfvf", "vgvg", "vhvh", "vivi", "vjvj", "vkvk", "vlvl", "vmvm", "vnvn", "vovo", "vpvp", "vqvq", "vrvr", "vsvs", "vtvt", "vuvu", "vvvv", "vwvw", "vxvx", "vyvy", "vzvz", "wawa", "wbwb", "wcwc", "wdwd", "wewe", "wfwf", "wgwg", "whwh", "wiwi", "wjwj", "wkwk", "wlwl", "wmwm", "wnwn", "wowo", "wpwp", "wqwq", "wrwr", "wsws", "wtwt", "wuwu", "wvwv", "wwww", "wxwx", "wywy", "wzwz", "xaxa", "xbxb", "xcxc", "xdxd", "xexe", "xfxf", "xgxg", "xhxh", "xixi", "xjxj", "xkxk", "xlxl", "xmxm", "xnxn", "xoxo", "xpxp", "xqxq", "xrxr", "xsxs", "xtxt", "xuxu", "xvxv", "xwxw", "xxxx", "xyxy", "xzxz", "yaya", "ybyb", "ycyc", "ydyd", "yeye", "yfyf", "ygyg", "yhyh", "yiyi", "yjyj", "ykyk", "ylyl", "ymym", "ynyn", "yoyo", "ypyp", "yqyq", "yryr", "ysys", "ytyt", "yuyu", "yvyv", "ywyw", "yxyx", "yyyy", "yzyz", "zaza", "zbzb", "zczc", "zdzd", "zeze", "zfzf", "zgzg", "zhzh", "zizi", "zjzj", "zkzk", "zlzl", "zmzm", "znzn", "zozo", "zpzp", "zqzq", "zrzr", "zszs", "ztzt", "zuzu", "zvzv", "zwzw", "zxzx", "zyzy", "zzzz", "aaaaaa", "abaaba", "acaaca", "adaada", "aeaaea", "afaafa", "agaaga", "ahaaha", "aiaaia", "ajaaja", "akaaka", "alaala", "amaama", "anaana", "aoaaoa", "apaapa", "aqaaqa", "araara", "asaasa", "ataata", "auaaua", "avaava", "awaawa", "axaaxa", "ayaaya", "azaaza", "babbab", "bbbbbb", "bcbbcb", "bdbbdb", "bebbeb", "bfbbfb", "bgbbgb", "bhbbhb", "bibbib", "bjbbjb", "bkbbkb", "blbblb", "bmbbmb", "bnbbnb", "bobbob", "bpbbpb", "bqbbqb", "brbbrb", "bsbbsb", "btbbtb", "bubbub", "bvbbvb", "bwbbwb", "bxbbxb", "bybbyb", "bzbbzb", "caccac", "cbccbc", "cccccc", "cdccdc", "ceccec", "cfccfc", "cgccgc", "chcchc", "ciccic", "cjccjc", "ckcckc", "clcclc", "cmccmc", "cnccnc", "coccoc", "cpccpc", "cqccqc", "crccrc", "csccsc", "ctcctc", "cuccuc", "cvccvc", "cwccwc", "cxccxc", "cyccyc", "czcczc", "daddad", "dbddbd", "dcddcd", "dddddd", "dedded", "dfddfd", "dgddgd", "dhddhd", "diddid", "djddjd", "dkddkd", "dlddld", "dmddmd", "dnddnd", "doddod", "dpddpd", "dqddqd", "drddrd", "dsddsd", "dtddtd", "duddud", "dvddvd", "dwddwd", "dxddxd", "dyddyd", "dzddzd", "eaeeae", "ebeebe", "eceece", "edeede", "eeeeee", "efeefe", "egeege", "eheehe", "eieeie", "ejeeje", "ekeeke", "eleele", "emeeme", "eneene", "eoeeoe", "epeepe", "eqeeqe", "ereere", "eseese", "eteete", "eueeue", "eveeve", "eweewe", "exeexe", "eyeeye", "ezeeze", "faffaf", "fbffbf", "fcffcf", "fdffdf", "feffef", "ffffff", "fgffgf", "fhffhf", "fiffif", "fjffjf", "fkffkf", "flfflf", "fmffmf", "fnffnf", "foffof", "fpffpf", "fqffqf", "frffrf", "fsffsf", "ftfftf", "fuffuf", "fvffvf", "fwffwf", "fxffxf", "fyffyf", "fzffzf", "gaggag", "gbggbg", "gcggcg", "gdggdg", "geggeg", "gfggfg", "gggggg", "ghgghg", "giggig", "gjggjg", "gkggkg", "glgglg", "gmggmg", "gnggng", "goggog", "gpggpg", "gqggqg", "grggrg", "gsggsg", "gtggtg", "guggug", "gvggvg", "gwggwg", "gxggxg", "gyggyg", "gzggzg", "hahhah", "hbhhbh", "hchhch", "hdhhdh", "hehheh", "hfhhfh", "hghhgh", "hhhhhh", "hihhih", "hjhhjh", "hkhhkh", "hlhhlh", "hmhhmh", "hnhhnh", "hohhoh", "hphhph", "hqhhqh", "hrhhrh", "hshhsh", "hthhth", "huhhuh", "hvhhvh", "hwhhwh", "hxhhxh", "hyhhyh", "hzhhzh", "iaiiai", "ibiibi", "iciici", "idiidi", "ieiiei", "ifiifi", "igiigi", "ihiihi", "iiiiii", "ijiiji", "ikiiki", "iliili", "imiimi", "iniini", "ioiioi", "ipiipi", "iqiiqi", "iriiri", "isiisi", "itiiti", "iuiiui", "iviivi", "iwiiwi", "ixiixi", "iyiiyi", "iziizi", "jajjaj", "jbjjbj", "jcjjcj", "jdjjdj", "jejjej", "jfjjfj", "jgjjgj", "jhjjhj", "jijjij", "jjjjjj", "jkjjkj", "jljjlj", "jmjjmj", "jnjjnj", "jojjoj", "jpjjpj", "jqjjqj", "jrjjrj", "jsjjsj", "jtjjtj", "jujjuj", "jvjjvj", "jwjjwj", "jxjjxj", "jyjjyj", "jzjjzj", "kakkak", "kbkkbk", "kckkck", "kdkkdk", "kekkek", "kfkkfk", "kgkkgk", "khkkhk", "kikkik", "kjkkjk", "kkkkkk", "klkklk", "kmkkmk", "knkknk", "kokkok", "kpkkpk", "kqkkqk", "krkkrk", "kskksk", "ktkktk", "kukkuk", "kvkkvk", "kwkkwk", "kxkkxk", "kykkyk", "kzkkzk", "lallal", "lbllbl", "lcllcl", "ldlldl", "lellel", "lfllfl", "lgllgl", "lhllhl", "lillil", "ljlljl", "lkllkl", "llllll", "lmllml", "lnllnl", "lollol", "lpllpl", "lqllql", "lrllrl", "lsllsl", "ltlltl", "lullul", "lvllvl", "lwllwl", "lxllxl", "lyllyl", "lzllzl", "mammam", "mbmmbm", "mcmmcm", "mdmmdm", "memmem", "mfmmfm", "mgmmgm", "mhmmhm", "mimmim", "mjmmjm", "mkmmkm", "mlmmlm", "mmmmmm", "mnmmnm", "mommom", "mpmmpm", "mqmmqm", "mrmmrm", "msmmsm", "mtmmtm", "mummum", "mvmmvm", "mwmmwm", "mxmmxm", "mymmym", "mzmmzm", "nannan", "nbnnbn", "ncnncn", "ndnndn", "nennen", "nfnnfn", "ngnngn", "nhnnhn", "ninnin", "njnnjn", "nknnkn", "nlnnln", "nmnnmn", "nnnnnn", "nonnon", "npnnpn", "nqnnqn", "nrnnrn", "nsnnsn", "ntnntn", "nunnun", "nvnnvn", "nwnnwn", "nxnnxn", "nynnyn", "nznnzn", "oaooao", "oboobo", "ocooco", "odoodo", "oeooeo", "ofoofo", "ogoogo", "ohooho", "oiooio", "ojoojo", "okooko", "oloolo", "omoomo", "onoono", "oooooo", "opoopo", "oqooqo", "orooro", "osooso", "otooto", "ouoouo", "ovoovo", "owoowo", "oxooxo", "oyooyo", "ozoozo", "pappap", "pbppbp", "pcppcp", "pdppdp", "peppep", "pfppfp", "pgppgp", "phpphp", "pippip", "pjppjp", "pkppkp", "plpplp", "pmppmp", "pnppnp", "poppop", "pppppp", "pqppqp", "prpprp", "psppsp", "ptpptp", "puppup", "pvppvp", "pwppwp", "pxppxp", "pyppyp", "pzppzp", "qaqqaq", "qbqqbq", "qcqqcq", "qdqqdq", "qeqqeq", "qfqqfq", "qgqqgq", "qhqqhq", "qiqqiq", "qjqqjq", "qkqqkq", "qlqqlq", "qmqqmq", "qnqqnq", "qoqqoq", "qpqqpq", "qqqqqq", "qrqqrq", "qsqqsq", "qtqqtq", "quqquq", "qvqqvq", "qwqqwq", "qxqqxq", "qyqqyq", "qzqqzq", "rarrar", "rbrrbr", "rcrrcr", "rdrrdr", "rerrer", "rfrrfr", "rgrrgr", "rhrrhr", "rirrir", "rjrrjr", "rkrrkr", "rlrrlr", "rmrrmr", "rnrrnr", "rorror", "rprrpr", "rqrrqr", "rrrrrr", "rsrrsr", "rtrrtr", "rurrur", "rvrrvr", "rwrrwr", "rxrrxr", "ryrryr", "rzrrzr", "sassas", "sbssbs", "scsscs", "sdssds", "sesses", "sfssfs", "sgssgs", "shsshs", "sissis", "sjssjs", "skssks", "slssls", "smssms", "snssns", "sossos", "spssps", "sqssqs", "srssrs", "ssssss", "stssts", "sussus", "svssvs", "swssws", "sxssxs", "syssys", "szsszs", "tattat", "tbttbt", "tcttct", "tdttdt", "tettet", "tfttft", "tgttgt", "thttht", "tittit", "tjttjt", "tkttkt", "tlttlt", "tmttmt", "tnttnt", "tottot", "tpttpt", "tqttqt", "trttrt", "tsttst", "tttttt", "tuttut", "tvttvt", "twttwt", "txttxt", "tyttyt", "tzttzt", "uauuau", "ubuubu", "ucuucu", "uduudu", "ueuueu", "ufuufu", "uguugu", "uhuuhu", "uiuuiu", "ujuuju", "ukuuku", "uluulu", "umuumu", "unuunu", "uouuou", "upuupu", "uquuqu", "uruuru", "usuusu", "utuutu", "uuuuuu", "uvuuvu", "uwuuwu", "uxuuxu", "uyuuyu", "uzuuzu", "vavvav", "vbvvbv", "vcvvcv", "vdvvdv", "vevvev", "vfvvfv", "vgvvgv", "vhvvhv", "vivviv", "vjvvjv", "vkvvkv", "vlvvlv", "vmvvmv", "vnvvnv", "vovvov", "vpvvpv", "vqvvqv", "vrvvrv", "vsvvsv", "vtvvtv", "vuvvuv", "vvvvvv", "vwvvwv", "vxvvxv", "vyvvyv", "vzvvzv", "wawwaw", "wbwwbw", "wcwwcw", "wdwwdw", "wewwew", "wfwwfw", "wgwwgw", "whwwhw", "wiwwiw", "wjwwjw", "wkwwkw", "wlwwlw", "wmwwmw", "wnwwnw", "wowwow", "wpwwpw", "wqwwqw", "wrwwrw", "wswwsw", "wtwwtw", "wuwwuw", "wvwwvw", "wwwwww", "wxwwxw", "wywwyw", "wzwwzw", "xaxxax", "xbxxbx", "xcxxcx", "xdxxdx", "xexxex", "xfxxfx", "xgxxgx", "xhxxhx", "xixxix", "xjxxjx", "xkxxkx", "xlxxlx", "xmxxmx", "xnxxnx", "xoxxox", "xpxxpx", "xqxxqx", "xrxxrx", "xsxxsx", "xtxxtx", "xuxxux", "xvxxvx", "xwxxwx", "xxxxxx", "xyxxyx", "xzxxzx", "yayyay", "ybyyby", "ycyycy", "ydyydy", "yeyyey", "yfyyfy", "ygyygy", "yhyyhy", "yiyyiy", "yjyyjy", "ykyyky", "ylyyly", "ymyymy", "ynyyny", "yoyyoy", "ypyypy", "yqyyqy", "yryyry", "ysyysy", "ytyyty", "yuyyuy", "yvyyvy", "ywyywy", "yxyyxy", "yyyyyy", "yzyyzy", "zazzaz", "zbzzbz", "zczzcz", "zdzzdz", "zezzez", "zfzzfz", "zgzzgz", "zhzzhz", "zizziz", "zjzzjz", "zkzzkz", "zlzzlz", "zmzzmz", "znzznz", "zozzoz", "zpzzpz", "zqzzqz", "zrzzrz", "zszzsz", "ztzztz", "zuzzuz", "zvzzvz", "zwzzwz", "zxzzxz", "zyzzyz", "zzzzzz", "aaaaaaaa", "abababab", "acacacac", "adadadad", "aeaeaeae", "afafafaf", "agagagag", "ahahahah", "aiaiaiai", "ajajajaj", "akakakak", "alalalal", "amamamam", "anananan", "aoaoaoao", "apapapap", "aqaqaqaq", "arararar", "asasasas", "atatatat", "auauauau", "avavavav", "awawawaw", "axaxaxax", "ayayayay", "azazazaz", "babababa", "bbbbbbbb", "bcbcbcbc", "bdbdbdbd", "bebebebe", "bfbfbfbf", "bgbgbgbg", "bhbhbhbh", "bibibibi", "bjbjbjbj", "bkbkbkbk", "blblblbl", "bmbmbmbm", "bnbnbnbn", "bobobobo", "bpbpbpbp", "bqbqbqbq", "brbrbrbr", "bsbsbsbs", "btbtbtbt", "bubububu", "bvbvbvbv", "bwbwbwbw", "bxbxbxbx", "bybybyby", "bzbzbzbz", "cacacaca", "cbcbcbcb", "cccccccc", "cdcdcdcd", "cececece", "cfcfcfcf", "cgcgcgcg", "chchchch", "cicicici", "cjcjcjcj", "ckckckck", "clclclcl", "cmcmcmcm", "cncncncn", "cocococo", "cpcpcpcp", "cqcqcqcq", "crcrcrcr", "cscscscs", "ctctctct", "cucucucu", "cvcvcvcv", "cwcwcwcw", "cxcxcxcx", "cycycycy", "czczczcz", "dadadada", "dbdbdbdb", "dcdcdcdc", "dddddddd", "dededede", "dfdfdfdf", "dgdgdgdg", "dhdhdhdh", "didididi", "djdjdjdj", "dkdkdkdk", "dldldldl", "dmdmdmdm", "dndndndn", "dodododo", "dpdpdpdp", "dqdqdqdq", "drdrdrdr", "dsdsdsds", "dtdtdtdt", "dudududu", "dvdvdvdv", "dwdwdwdw", "dxdxdxdx", "dydydydy", "dzdzdzdz", "eaeaeaea", "ebebebeb", "ecececec", "edededed", "eeeeeeee", "efefefef", "egegegeg", "eheheheh", "eieieiei", "ejejejej", "ekekekek", "elelelel", "emememem", "enenenen", "eoeoeoeo", "epepepep", "eqeqeqeq", "erererer", "eseseses", "etetetet", "eueueueu", "evevevev", "ewewewew", "exexexex", "eyeyeyey", "ezezezez", "fafafafa", "fbfbfbfb", "fcfcfcfc", "fdfdfdfd", "fefefefe", "ffffffff", "fgfgfgfg", "fhfhfhfh", "fifififi", "fjfjfjfj", "fkfkfkfk", "flflflfl", "fmfmfmfm", "fnfnfnfn", "fofofofo", "fpfpfpfp", "fqfqfqfq", "frfrfrfr", "fsfsfsfs", "ftftftft", "fufufufu", "fvfvfvfv", "fwfwfwfw", "fxfxfxfx", "fyfyfyfy", "fzfzfzfz", "gagagaga", "gbgbgbgb", "gcgcgcgc", "gdgdgdgd", "gegegege", "gfgfgfgf", "gggggggg", "ghghghgh", "gigigigi", "gjgjgjgj", "gkgkgkgk", "glglglgl", "gmgmgmgm", "gngngngn", "gogogogo", "gpgpgpgp", "gqgqgqgq", "grgrgrgr", "gsgsgsgs", "gtgtgtgt", "gugugugu", "gvgvgvgv", "gwgwgwgw", "gxgxgxgx", "gygygygy", "gzgzgzgz", "hahahaha", "hbhbhbhb", "hchchchc", "hdhdhdhd", "hehehehe", "hfhfhfhf", "hghghghg", "hhhhhhhh", "hihihihi", "hjhjhjhj", "hkhkhkhk", "hlhlhlhl", "hmhmhmhm", "hnhnhnhn", "hohohoho", "hphphphp", "hqhqhqhq", "hrhrhrhr", "hshshshs", "hthththt", "huhuhuhu", "hvhvhvhv", "hwhwhwhw", "hxhxhxhx", "hyhyhyhy", "hzhzhzhz", "iaiaiaia", "ibibibib", "icicicic", "idididid", "ieieieie", "ifififif", "igigigig", "ihihihih", "iiiiiiii", "ijijijij", "ikikikik", "ilililil", "imimimim", "inininin", "ioioioio", "ipipipip", "iqiqiqiq", "iriririr", "isisisis", "itititit", "iuiuiuiu", "iviviviv", "iwiwiwiw", "ixixixix", "iyiyiyiy", "iziziziz", "jajajaja", "jbjbjbjb", "jcjcjcjc", "jdjdjdjd", "jejejeje", "jfjfjfjf", "jgjgjgjg", "jhjhjhjh", "jijijiji", "jjjjjjjj", "jkjkjkjk", "jljljljl", "jmjmjmjm", "jnjnjnjn", "jojojojo", "jpjpjpjp", "jqjqjqjq", "jrjrjrjr", "jsjsjsjs", "jtjtjtjt", "jujujuju", "jvjvjvjv", "jwjwjwjw", "jxjxjxjx", "jyjyjyjy", "jzjzjzjz", "kakakaka", "kbkbkbkb", "kckckckc", "kdkdkdkd", "kekekeke", "kfkfkfkf", "kgkgkgkg", "khkhkhkh", "kikikiki", "kjkjkjkj", "kkkkkkkk", "klklklkl", "kmkmkmkm", "knknknkn", "kokokoko", "kpkpkpkp", "kqkqkqkq", "krkrkrkr", "ksksksks", "ktktktkt", "kukukuku", "kvkvkvkv", "kwkwkwkw", "kxkxkxkx", "kykykyky", "kzkzkzkz", "lalalala", "lblblblb", "lclclclc", "ldldldld", "lelelele", "lflflflf", "lglglglg", "lhlhlhlh", "lililili", "ljljljlj", "lklklklk", "llllllll", "lmlmlmlm", "lnlnlnln", "lolololo", "lplplplp", "lqlqlqlq", "lrlrlrlr", "lslslsls", "ltltltlt", "lulululu", "lvlvlvlv", "lwlwlwlw", "lxlxlxlx", "lylylyly", "lzlzlzlz", "mamamama", "mbmbmbmb", "mcmcmcmc", "mdmdmdmd", "memememe", "mfmfmfmf", "mgmgmgmg", "mhmhmhmh", "mimimimi", "mjmjmjmj", "mkmkmkmk", "mlmlmlml", "mmmmmmmm", "mnmnmnmn", "momomomo", "mpmpmpmp", "mqmqmqmq", "mrmrmrmr", "msmsmsms", "mtmtmtmt", "mumumumu", "mvmvmvmv", "mwmwmwmw", "mxmxmxmx", "mymymymy", "mzmzmzmz", "nananana", "nbnbnbnb", "ncncncnc", "ndndndnd", "nenenene", "nfnfnfnf", "ngngngng", "nhnhnhnh", "nininini", "njnjnjnj", "nknknknk", "nlnlnlnl", "nmnmnmnm", "nnnnnnnn", "nononono", "npnpnpnp", "nqnqnqnq", "nrnrnrnr", "nsnsnsns", "ntntntnt", "nunununu", "nvnvnvnv", "nwnwnwnw", "nxnxnxnx", "nynynyny", "nznznznz", "oaoaoaoa", "obobobob", "ococococ", "odododod", "oeoeoeoe", "ofofofof", "ogogogog", "ohohohoh", "oioioioi", "ojojojoj", "okokokok", "olololol", "omomomom", "onononon", "oooooooo", "opopopop", "oqoqoqoq", "orororor", "osososos", "otototot", "ouououou", "ovovovov", "owowowow", "oxoxoxox", "oyoyoyoy", "ozozozoz", "papapapa", "pbpbpbpb", "pcpcpcpc", "pdpdpdpd", "pepepepe", "pfpfpfpf", "pgpgpgpg", "phphphph", "pipipipi", "pjpjpjpj", "pkpkpkpk", "plplplpl", "pmpmpmpm", "pnpnpnpn", "popopopo", "pppppppp", "pqpqpqpq", "prprprpr", "pspspsps", "ptptptpt", "pupupupu", "pvpvpvpv", "pwpwpwpw", "pxpxpxpx", "pypypypy", "pzpzpzpz", "qaqaqaqa", "qbqbqbqb", "qcqcqcqc", "qdqdqdqd", "qeqeqeqe", "qfqfqfqf", "qgqgqgqg", "qhqhqhqh", "qiqiqiqi", "qjqjqjqj", "qkqkqkqk", "qlqlqlql", "qmqmqmqm", "qnqnqnqn", "qoqoqoqo", "qpqpqpqp", "qqqqqqqq", "qrqrqrqr", "qsqsqsqs", "qtqtqtqt", "ququququ", "qvqvqvqv", "qwqwqwqw", "qxqxqxqx", "qyqyqyqy", "qzqzqzqz", "rararara", "rbrbrbrb", "rcrcrcrc", "rdrdrdrd", "rererere", "rfrfrfrf", "rgrgrgrg", "rhrhrhrh", "riririri", "rjrjrjrj", "rkrkrkrk", "rlrlrlrl", "rmrmrmrm", "rnrnrnrn", "rorororo", "rprprprp", "rqrqrqrq", "rrrrrrrr", "rsrsrsrs", "rtrtrtrt", "rurururu", "rvrvrvrv", "rwrwrwrw", "rxrxrxrx", "ryryryry", "rzrzrzrz", "sasasasa", "sbsbsbsb", "scscscsc", "sdsdsdsd", "sesesese", "sfsfsfsf", "sgsgsgsg", "shshshsh", "sisisisi", "sjsjsjsj", "sksksksk", "slslslsl", "smsmsmsm", "snsnsnsn", "sosososo", "spspspsp", "sqsqsqsq", "srsrsrsr", "ssssssss", "stststst", "susususu", "svsvsvsv", "swswswsw", "sxsxsxsx", "sysysysy", "szszszsz", "tatatata", "tbtbtbtb", "tctctctc", "tdtdtdtd", "tetetete", "tftftftf", "tgtgtgtg", "thththth", "titititi", "tjtjtjtj", "tktktktk", "tltltltl", "tmtmtmtm", "tntntntn", "totototo", "tptptptp", "tqtqtqtq", "trtrtrtr", "tstststs", "tttttttt", "tutututu", "tvtvtvtv", "twtwtwtw", "txtxtxtx", "tytytyty", "tztztztz", "uauauaua", "ubububub", "ucucucuc", "udududud", "ueueueue", "ufufufuf", "ugugugug", "uhuhuhuh", "uiuiuiui", "ujujujuj", "ukukukuk", "ulululul", "umumumum", "unununun", "uouououo", "upupupup", "uquququq", "urururur", "usususus", "utututut", "uuuuuuuu", "uvuvuvuv", "uwuwuwuw", "uxuxuxux", "uyuyuyuy", "uzuzuzuz", "vavavava", "vbvbvbvb", "vcvcvcvc", "vdvdvdvd", "veveveve", "vfvfvfvf", "vgvgvgvg", "vhvhvhvh", "vivivivi", "vjvjvjvj", "vkvkvkvk", "vlvlvlvl", "vmvmvmvm", "vnvnvnvn", "vovovovo", "vpvpvpvp", "vqvqvqvq", "vrvrvrvr", "vsvsvsvs", "vtvtvtvt", "vuvuvuvu", "vvvvvvvv", "vwvwvwvw", "vxvxvxvx", "vyvyvyvy", "vzvzvzvz", "wawawawa", "wbwbwbwb", "wcwcwcwc", "wdwdwdwd", "wewewewe", "wfwfwfwf", "wgwgwgwg", "whwhwhwh", "wiwiwiwi", "wjwjwjwj", "wkwkwkwk", "wlwlwlwl", "wmwmwmwm", "wnwnwnwn", "wowowowo", "wpwpwpwp", "wqwqwqwq", "wrwrwrwr", "wswswsws", "wtwtwtwt", "wuwuwuwu", "wvwvwvwv", "wwwwwwww", "wxwxwxwx", "wywywywy", "wzwzwzwz", "xaxaxaxa", "xbxbxbxb", "xcxcxcxc", "xdxdxdxd", "xexexexe", "xfxfxfxf", "xgxgxgxg", "xhxhxhxh", "xixixixi", "xjxjxjxj", "xkxkxkxk", "xlxlxlxl", "xmxmxmxm", "xnxnxnxn", "xoxoxoxo", "xpxpxpxp", "xqxqxqxq", "xrxrxrxr", "xsxsxsxs", "xtxtxtxt", "xuxuxuxu", "xvxvxvxv", "xwxwxwxw", "xxxxxxxx", "xyxyxyxy", "xzxzxzxz", "yayayaya", "ybybybyb", "ycycycyc", "ydydydyd", "yeyeyeye", "yfyfyfyf", "ygygygyg", "yhyhyhyh", "yiyiyiyi", "yjyjyjyj", "ykykykyk", "ylylylyl", "ymymymym", "ynynynyn", "yoyoyoyo", "ypypypyp", "yqyqyqyq", "yryryryr", "ysysysys", "ytytytyt", "yuyuyuyu", "yvyvyvyv", "ywywywyw", "yxyxyxyx", "yyyyyyyy", "yzyzyzyz", "zazazaza", "zbzbzbzb", "zczczczc", "zdzdzdzd", "zezezeze", "zfzfzfzf", "zgzgzgzg", "zhzhzhzh", "zizizizi", "zjzjzjzj", "zkzkzkzk", "zlzlzlzl", "zmzmzmzm", "znznznzn", "zozozozo", "zpzpzpzp", "zqzqzqzq", "zrzrzrzr", "zszszszs", "ztztztzt", "zuzuzuzu", "zvzvzvzv", "zwzwzwzw", "zxzxzxzx", "zyzyzyzy", "zzzzzzzz"};
    public static void main(String[] args) {
        test_no17(10);
    }
    public static void Old_test_no5(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 10; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no5((i+1)*10);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 5,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] Old_no5(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int target = (int)(Math.random()*num);
        sb.append(name[target]);
        sb.append(" ");
        sb.append(num);
        sb.append("\\n");
        for (int i = 0; i < num; i++) {
            sb.append(name[i]);
            int month = (int)(Math.random()*12+1);
            int day = (int)(Math.random()*29+1);
            sb.append(" ");
            sb.append(month);
            sb.append("/");
            sb.append(day);
            sb.append("\\n");
            if (i==target){
                st[1] = month + "/" + day;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString();
        return st;
    }
    public static void test_no5(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 10; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no5((i+1)*10);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 5,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no5(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        sb.append(num);
        sb.append("\\n");
        int count = 0;
        for (int i = 0; i < num; i++) {
            int score = (int)(Math.random()*100+1);
            sb.append(score);
            sb.append("\\n");
            count += score;
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString(); st[1] = Integer.toString(count);
        return st;
    }
    public static void test_no6(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 10; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no6((i+1)*10);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 6,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no6(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int[] cards = new int[num];
        int target = (int)(Math.random()*299991)+10;
        sb.append(num);
        sb.append(" ");
        sb.append(target);
        sb.append("\\n");
        for (int i = 0; i < num; i++) {
            int card = (int)(Math.random()*(100000)+1);
            cards[i] = card;
            sb.append(card);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString(); st[1] = Integer.toString(solve_no6(cards, target));
        return st;
    }
    public static int solve_no6(int[] num, int m){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            if (temp <= m)
                max1 = max1 < temp ? temp : max1;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int temp = num[i]+num[j];
                if (temp <= m)
                    max2 = max2 < temp ? temp : max2;
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                for (int k = j+1; k < num.length; k++) {
                    int temp = num[i]+num[j]+num[k];
                    if (temp <= m)
                        max3 = max3 < temp ? temp : max3;
                }
            }
        }
        int max = max1 < max2 ? max2 : max1;
        max = max < max3 ? max3 : max;
        return max;
    }
    public static int solve_no6_real(){
        Scanner s = new Scanner(System.in);
        int cards = s.nextInt();
        int m = s.nextInt();
        int[] num = new int[cards];
        for (int i = 0; i < cards; i++) {
            num[i] = s.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            if (temp <= m)
                max1 = max1 < temp ? temp : max1;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int temp = num[i]+num[j];
                if (temp <= m)
                    max2 = max2 < temp ? temp : max2;
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                for (int k = j+1; k < num.length; k++) {
                    int temp = num[i]+num[j]+num[k];
                    if (temp <= m)
                        max3 = max3 < temp ? temp : max3;
                }
            }
        }
        int max = max1 < max2 ? max2 : max1;
        max = max < max3 ? max3 : max;
        return max;
    }
    public static void test_no7(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 10; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no7(i+1);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 7,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no7(int num){
        StringBuilder sb = new StringBuilder();
        StringBuilder out = new StringBuilder();
        String[] st = new String[2];
        sb.append(num);
        sb.append("\\n");
        int count = 0;
        for (int i = 0; i < num; i++) {
            int space = (int)(Math.random()*2)+1;
            int words = (int)(Math.random()*100)+1;
            if (space==2)
                sb.append(" ");
            for (int j = 0; j < words; j++) {
                int index = (int)(Math.random()*name.length);
                sb.append(name[index]);
                sb.append(" ");
            }
            sb.append("\\n");
            out.append(words);out.append("\\n");
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        out.deleteCharAt(out.length()-1); out.deleteCharAt(out.length()-1);
        st[0] = sb.toString(); st[1] = out.toString();
        return st;
    }
    public static void test_no8(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 10; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no8((i+1)*50);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 8,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no8(int num){
        StringBuilder in = new StringBuilder();
        String[] st = new String[2];
        int limit = (int)(Math.random()*(num - 1))+1;
        Set<Double> times = new HashSet<>();
        String[] students = new String[num];
        double[][] t = new double[num][2];
        in.append(limit);
        in.append(" ");
        in.append(num);
        in.append("\\n");
        for (int i = 0; i < num; i++) {
            double time = (int)(Math.random()*4000+1)/100.0;
            while (times.contains(time)){
                time = (int)(Math.random()*4000+1)/100.0;
            }
            times.add(time);
            students[i] = name[i];
            t[i][0] = i;
            t[i][1] = time;
            in.append(name[i]);
            in.append(" ");
            in.append(time);
            in.append("\\n");
        }
        in.deleteCharAt(in.length()-1); in.deleteCharAt(in.length()-1);
        Arrays.sort(t, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[1], o2[1]);
            }
        });
        st[0] = in.toString(); st[1] = students[(int)t[limit][0]];
        return st;
    }
    public static void test_no9(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 5; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no9((i+1)*60);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 9,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no9(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int target = (int)(Math.random()*num)+1;
        int[] numbers = new int[num];

        sb.append(num);
        sb.append(" ");
        sb.append(name[target-1]);
        sb.append("\\n");
        for (int i = 0; i < num; i++) {
            int temp = (int)(Math.random()*(num-1))+1;
            sb.append(name[i]);
            sb.append(" ");
            sb.append(temp);
            sb.append("\\n");
            numbers[i] = temp;
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString(); st[1] = name[solve_no9(numbers, target)].toString();
        return st;
    }
    public static int solve_no9(int[] numbers, int target){
        Queue<int[]> teachers = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            int[] temp = new int[2];
            temp[0] = i; temp[1] = numbers[i];
            teachers.offer(temp);
        }
        for (int i = 0; i < target-1; i++) {
            teachers.offer(teachers.poll());
        }
        int[] temp = teachers.peek();
        int next = temp[1];
        while(teachers.size()>1){
            for (int i = 0; i < next; i++) {
                teachers.offer(teachers.poll());
            }
            temp = teachers.poll();
            next = temp[1]-1;
        }
        temp = teachers.poll();
        return temp[0];
    }
    static int[][] solutions;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int volume;
    static List<Integer> res;
    public static void test_no10(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 5; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no10((i+1)*5);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 10,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no10(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int[][] island = new int[num][num];
        sb.append(num);
        sb.append("\\n");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int temp = (int)(Math.random()*4);
                sb.append(temp);
                island[i][j] = temp;
            }
            sb.append("\\n");
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        solutions = island;
        visited = new boolean[num][num];
        res = new ArrayList<>();
        volume = 0;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(solutions[i][j] > 0 && !visited[i][j]) {
                    volume = solutions[i][j];
                    DFS(i,j, num);
                    res.add(volume);
                }
            }
        }
        StringBuilder out = new StringBuilder();
        out.append(res.size() + "\\n");
        Collections.sort(res, Comparator.reverseOrder());
        for (int i = 0; i < res.size(); i++) {
            out.append(res.get(i) + "\\n");
        }
        out.deleteCharAt(out.length()-1); out.deleteCharAt(out.length()-1);
        st[0] = sb.toString(); st[1] = out.toString();
        return st;
    }
    public static void DFS(int x, int y, int size){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < size && ny < size && !visited[nx][ny] && solutions[nx][ny] > 0) {
                volume += solutions[nx][ny];
                DFS(nx,ny, size);
            }
        }
    }
    public static void test_no11(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 5; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no11((i+1)*60);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 11,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no11(int num){
        StringBuilder sb = new StringBuilder();
        StringBuilder out = new StringBuilder();
        String[] st = new String[2];
        int category = (int)(Math.random()*5)+1;
        int subject = num/category;
        int available = category;
        sb.append(num);
        sb.append(" ");
        sb.append(category);
        sb.append("\\n");
        int[] selection = new int[category];
        for (int i = 0; i < category; i++) {
            sb.append(name[i]);
            sb.append(" ");
            int required = (int)(Math.random()*subject)+1;
            selection[i] = required;
            sb.append(required);
            sb.append("\\n");
        }
        for (int i = 0; i < category; i++) {
            String[] subjects = new String[subject];
            boolean[] tests = new boolean[subject];
            for (int j = 0; j < subject; j++) {
                int test = (int)(Math.random()*2);
                String sj = name[available]; available++;
                if (test == 1)
                    tests[j] = true;
                subjects[j] = sj;
                sb.append(sj);
                sb.append(" ");
                sb.append(name[i]);
                sb.append(" ");
                sb.append(test);
                sb.append("\\n");
            }
            out.append(no11_solver(subjects, tests, selection[i]));
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        out.deleteCharAt(out.length()-1); out.deleteCharAt(out.length()-1);
        st[0] = sb.toString(); st[1] = out.toString();
        return st;
    }
    public static String no11_solver(String[] sj, boolean[] tests, int required){
        StringBuilder res = new StringBuilder();
        int count = 0;
        boolean[] yes = new boolean[tests.length];
        for (int i = 0; i < tests.length; i++) {
            if (!tests[i] && required > count){
                yes[i] = true;
                count++;
            }
            if (count == required)
                break;
        }
        for (int i = 0; i < tests.length; i++) {
            if (tests[i] && required > count){
                yes[i] = true;
                count++;
            }
            if (count == required)
                break;
        }
        for (int i = 0; i < yes.length; i++) {
            if (yes[i])
                res.append(sj[i] + "\\n");
        }
        return res.toString();
    }
    public static void test_no12(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 5; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no12((i+1)*5);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 12,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no12(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        ArrayList<Integer> sn = new ArrayList<>();
        for (int i = 0; i < num*num; i++) {
            sn.add(i + 1);
        }
        Collections.shuffle(sn);
        sb.append(num);
        sb.append("\\n");
        int[][] desk = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int temp = sn.get(i*num+j);
                desk[i][j] = temp;
                sb.append(temp);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\\n");
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);

        for (int i = 0; i < num; i++) {
            Arrays.sort(desk[i]);
        }
        Arrays.sort(desk, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[num-1]-o2[num-1];
            }
        });
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += desk[i][i];
        }
        st[0] = sb.toString(); st[1] = Integer.toString(sum);
        return st;
    }
    public static void test_no13(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 1; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no13((i+1)*800);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 13,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no13(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int edge = (int)(Math.random()*(num*(num-1)/2))+1;
        sb.append(num);
        sb.append(" ");
        sb.append(edge);
        sb.append("\\n");
        int count = 0;
        boolean[][] adj = new boolean[num][num];
        while(count < edge){
            for (int i = 0; i < num; i++) {
                if (count == edge)
                    break;
                for (int j = 0; j < num; j++) {
                    if (count == edge)
                        break;
                    int link = (int)(Math.random()*8)+1;
                    if (!adj[i][j] && link == 1){
                        sb.append(i+1);
                        sb.append(" ");
                        sb.append(j+1);
                        sb.append("\\n");
                        adj[i][j] = true;
                        count++;
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        int loop = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (adj[i][j] && adj[j][i])
                    loop++;
            }
        }
        st[0] = sb.toString(); st[1] = Integer.toString(loop);
        return st;
    }
    public static void test_no14(){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 1; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no14((i+1)*5);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        String[] temp = no14(0);
        in.append("\'");
        out.append("\'");
        in.append(temp[0]);
        out.append(temp[1]);
        in.append("\'");
        out.append("\'");
        in.append(", ");
        out.append(", ");
        temp = no14(25);
        in.append("\'");
        out.append("\'");
        in.append(temp[0]);
        out.append(temp[1]);
        in.append("\'");
        out.append("\'");
        in.append("],");
        out.append("]");
        System.out.println("id : 14,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no14(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        if (num == 0){
            sb.append("60 0\\n");
            for (int i = 0; i < 60; i++) {
                int price = (int)(Math.random()*40)+1;
                int satisfy = (int)(Math.random()*40)+1;
                sb.append(name[i] + " " + price + " " + satisfy+ "\\n");
            }
            sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
            st[0] = sb.toString();
            st[1] = "";
            return st;
        }
        if (num == 25){
            int budget = 100000000;
            sb.append("25 " + budget + "\\n");
            for (int i = 0; i < 25; i++) {
                int cost = (int)(Math.random()*100000000) + 1;
                int score = (int)(Math.random()*1001) + 1;
                sb.append(name[i] + " " + cost + " " + score + "\\n");
            }
            sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
            st[0] = sb.toString(); st[1] = "브루트포스로 알아서 뽑도록";
            return st;
        }
        int budget = (int)(Math.random()*100000)+1;
        sb.append(num);
        sb.append(" ");
        sb.append(budget);
        sb.append("\\n");
        int[] cost = new int[num+1]; int[] score = new int[num+1]; //0은 비용, 1은 만족도
        for (int i = 0; i < num; i++) {
            int price = (int)(Math.random()*budget)+1;
            int satisfy = (int)(Math.random()*1001);
            cost[i + 1] = price; score[i + 1] = satisfy;
            sb.append(name[i] + " " + price + " " + satisfy + "\\n");
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        int[][] dp = new int[num + 1][budget + 1];
        String[][] selection = new String[num+1][budget+1];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= budget; j++) {
                if (cost[i] > j){
                    dp[i][j] = dp[i - 1][j];
                    selection[i][j] = selection[i - 1][j];
                }
                else{
                    int temp = dp[i - 1][j - cost[i]] + score[i];
                    if (temp >= dp[i - 1][j]){
                        dp[i][j] = temp;
                        selection[i][j] = selection[i - 1][j - cost[i]] + "\\n" + name[i - 1];
                    }
                    else{
                        dp[i][j] = dp[i - 1][j];
                        selection[i][j] = selection[i][j - 1];
                    }
                }
            }
        }
        StringBuilder out = new StringBuilder();
        out.append(selection[num][budget]);
        if (out.length() > 0){
            out.deleteCharAt(0); out.deleteCharAt(0);
            out.deleteCharAt(0); out.deleteCharAt(0);
            out.deleteCharAt(0); out.deleteCharAt(0);
        }
        st[0] = sb.toString();st[1] = out.toString();
        return st;
    }
    public static void test_no15(int num){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 1; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no15(num);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 15,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    static int vertex,edge,start;
    static List<Node>[] list;
    static int[] dist;
    static final int INF = 100_000_000;
    public static String[] no15(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        vertex = num;
        edge = num * (num / 100);
        list = new ArrayList[num+1];
        dist = new int[num+1];
        sb.append(num + " " + edge + "\\n");
        start = (int)(Math.random()*num) + 1;
        int end = (int)(Math.random()*num) + 1;
        while (end == start)
            end = (int)(Math.random()*num) + 1;
        sb.append(start + " " + end + "\\n");
        int count = 0;
        Arrays.fill(dist, INF);
        for(int i = 1; i <= num; i++){
            list[i] = new ArrayList<>();
        }
        Set<String> weights = new HashSet<>();
        while (edge > count){
            for (int i = 1; i <= num; i++) {
                if (edge == count)
                    break;
                int connect = (int)(Math.random()*1000);
                if (connect < 999)
                    continue;
                for (int j = 1; j <= num; j++) {
                    if (edge == count)
                        break;
                    if (i == j || weights.contains(i + " " + j))
                        continue;
                    connect = (int)(Math.random()*100);
                    if (connect < 99)
                        continue;
                    int weight = (int)(Math.random()*10)+1;
                    count++;
                    weights.add(i + " " + j);
                    sb.append(i + " " + j + " " + weight + "\\n");
                    list[i].add(new Node(j, weight));
                }

            }
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        dijkstra(start);
        if (dist[end] == INF)
            st[1] = "-1";
        else
            st[1] = Integer.toString(dist[end]);
        st[0] = sb.toString();
        return st;
    }
    private static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[vertex + 1];
        queue.add(new Node(start, 0));
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node curNode = queue.poll();
            int cur = curNode.next;
            if(check[cur] == true) continue;
            check[cur] = true;
            for(Node node : list[cur]){
                if(dist[node.next] > dist[cur] + node.weight){
                    dist[node.next] = dist[cur] + node.weight;
                    queue.add(new Node(node.next, dist[node.next]));
                }
            }
        }
    }
    public static void test_no16(int num){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 1; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no16(num);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 16,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no16(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        sb.append(num);
        sb.append("\\n");
        int[] acidity = new int[num];
        for (int i = 0; i < num; i++) {
            int temp = (int)(Math.random()*20000001) - 10000000;
            acidity[i] = temp;
            sb.append(temp + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString();

        Arrays.sort(acidity);
        if (acidity[0] >= 0){
            st[1] = acidity[1] + " " + acidity[0];
            return st;
        }

        if (acidity[num - 1] <= 0){
            st[1] = acidity[num - 1] + " " + acidity[num - 2];
            return st;
        }

        int mid = 0;
        while (acidity[mid] < 0)
            mid++;
        Set<String> res = new LinkedHashSet<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mid; i++) {
            for (int j = num - 1; j >= mid; j--) {
                int temp = acidity[i] + acidity[j];
                String s = acidity[j] + " " + acidity[i];
                if (temp < -1 * min)
                    break;
                else if (Math.abs(temp) == min) {
                    res.add(s);
                } else if (Math.abs(temp) < min) {
                    min = Math.abs(temp);
                    res = new LinkedHashSet<>();
                    res.add(s);
                }
            }
        }
        StringBuilder out = new StringBuilder();
        int count = 0;
        for (String s : res) {
            out.append(s + "\\n");
            if (count == 0)
                break;
        }
        out.deleteCharAt(out.length()-1); out.deleteCharAt(out.length()-1);
        st[1] = out.toString();
        return st;
    }
    public static void test_no17(int num){
        StringBuilder in = new StringBuilder();
        StringBuilder out = new StringBuilder();
        in.append("input : [");
        out.append("output : [");
        for (int i = 0; i < 1; i++) {
            in.append("\'");
            out.append("\'");
            String[] temp = no17(num);
            in.append(temp[0]);
            out.append(temp[1]);
            in.append("\'");
            out.append("\'");
            in.append(", ");
            out.append(", ");
        }
        in.deleteCharAt(in.length()-1);in.deleteCharAt(in.length()-1);
        out.deleteCharAt(out.length()-1);out.deleteCharAt(out.length()-1);
        in.append("],");
        out.append("]");
        System.out.println("id : 17,");
        System.out.println(in.toString());
        System.out.println(out.toString());
    }
    public static String[] no17(int num){
        StringBuilder sb = new StringBuilder();
        String[] st = new String[2];
        int edge = (int)(Math.random()*(num*(num-1)/2)) + num;
        sb.append(num);
        sb.append(" ");
        sb.append(edge);
        sb.append("\\n");
        int start = (int)(Math.random()*(num/2)) + 1;
        int end = (int)(Math.random()*(num/2)) + num/2 + 1;
        sb.append(start + " " + end + "\\n");
        int count = 0;
        int[][] adj = new int[num][num];
        while(count < edge){
            for (int i = 0; i < num; i++) {
                if (count == edge)
                    break;
                for (int j = i + 1; j < num; j++) {
                    if (count == edge)
                        break;
                    int link = (int)(Math.random()*3);
                    if (adj[i][j] == 0 && link == 0){
                        sb.append(i+1);
                        sb.append(" ");
                        sb.append(j+1);
                        sb.append("\\n");
                        adj[i][j] = 1;
                        count++;
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length()-1); sb.deleteCharAt(sb.length()-1);
        st[0] = sb.toString();
        boolean cango = false;
        for (int i = start - 1; i < num; i++) {
            if (adj[i][end-1] > 0){
                cango = true;
                break;
            }
        }
        if (!cango) {
            st[1] = "0.0";
            return st;
        }
        int temp = end - start + 1;
        double[][] part = new double[temp][temp];
        for (int i = start - 1; i < end; i++) {
            int sum = 0;
            for (int j =  0; j < num; j++) {
                sum += adj[i][j];
            }
            if (sum != 0){
                for (int j = 0; j < temp; j++) {
                    if (adj[i][j + start - 1] != 0)
                        part[i - start + 1][j] = 1.0 / sum;
                }
            }
        }

        double[] part_temp = Arrays.copyOf(part[0], part[0].length);
        double possibility = part_temp[temp - 1];
        for (int i = 0; i < temp - 2; i++) {
            double[] temp2 = new double[temp];
            for (int j = 0; j < temp; j++) {
                double mm = 0;
                for (int k = 0; k < temp; k++) {
                    mm += part_temp[k] * part[k][j];
                }
                temp2[j] = mm;
            }
            part_temp = temp2;
            possibility += part_temp[temp - 1];

        }
        BigDecimal bd = BigDecimal.valueOf(possibility);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        st[1] = Double.toString(bd.doubleValue());
        return st;
    }
}
